package mobi.omegacentauri.Earpiece;

import mobi.omegacentauri.Earpiece.R;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class Options extends PreferenceActivity {
	public static final String PREF_EQUALIZER_ACTIVE = "equalizerActive";
	public static final String PREF_NOTIFY = "notification";
	public static final String PREF_FIRST_TIME = "firstTime";
	public static final int NOTIFY_NEVER = 0;
	public static final int NOTIFY_AUTO = 1;
	public static final int NOTIFY_ALWAYS = 2;
	public static final String PREF_AD = "lastAd";
	public static final String PREF_BOOST = "boost";
	public static final String PREF_EARPIECE_ACTIVE = "earpieceActive";
	public static final String PREF_PROXIMITY = "proximity";
	public static final String PREF_AUTO_SPEAKER_PHONE = "autoSpeakerPhone";
	public static final String PREF_DISABLE_KEYGUARD = "disableKeyguard";
	public static final String PREF_LAST_VERSION = "lastVersion1";
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		addPreferencesFromResource(R.xml.options);
	}
	
	@Override
	public void onResume() {
		super.onResume();
	}
	
	@Override
	public void onStop() {
		super.onStop();
	}

	private static boolean isKindle() {
		return Build.MODEL.equalsIgnoreCase("Kindle Fire");		
	}
	
	public static int getNotify(SharedPreferences options) {
		int n = Integer.parseInt(options.getString(PREF_NOTIFY, isKindle() ? "2" : "1"));
//		if (n == NOTIFY_NEVER)
//			return NOTIFY_AUTO;
//		else
//			return n;
		return n;
   	}
}
