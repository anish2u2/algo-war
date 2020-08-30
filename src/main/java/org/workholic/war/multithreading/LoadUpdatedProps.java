package org.workholic.war.multithreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

/**
 * This class will provide an example of loading updated props.
 * 
 * @author Anish Singh(anish2u2@gmail.com)
 *
 */
public class LoadUpdatedProps {

	private static PropertiesLoader loader;

	public static void main(String args[]) {
		LoadUpdatedProps loadUpdatedProps = new LoadUpdatedProps();
		loadUpdatedProps.loader = new PropertiesLoader();
		TimerTask timerTask = new TimerTask() {

			@Override
			public void run() {
				if (loader.propFileUpdated()) {
					System.out.println("Property updated.. loading new props.");
					loader = new PropertiesLoader();
				}
			}
		};
		Timer timer=new Timer("UPDATE-PROPS-CHECK");
		timer.scheduleAtFixedRate(timerTask, 1000, 500);
		
	}

	public void setPropertyLoader(PropertiesLoader loader) {
		this.loader = loader;
	}

	static class PropertiesLoader {
		private Properties props;

		private String absoluteFilePath = "";

		private Date lastCheckedTime = null;

		public PropertiesLoader() {
			props = new Properties();
			try {
				props.load(new FileInputStream(new File(absoluteFilePath)));
				props.forEach((key,value)->System.out.println(Thread.currentThread().getId()+" Key:"+key+" value:"+value));
				lastCheckedTime = new Date();
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

		public String getProperty(String key) {
			return (String) this.props.get(key);
		}

		public boolean propFileUpdated() {
			File file = new File(absoluteFilePath);
			if (file.exists()) {
				Calendar cal = Calendar.getInstance();
				cal.setTime(new Date(file.lastModified()));
				Date lastModifiedTime = cal.getTime();
				if (lastCheckedTime.before(lastModifiedTime)) {
					return true;
				}
				return false;
			}
			return false;
		}
	}

}
