package com.triomobilsistemler.helpers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class FragmentHelper {

	public static Fragment fragment = null;
	public static Fragment tempFragment = null;
	public static FragmentManager fragmentManager;
	public static FragmentTransaction fragmentTransaction;

	public static void replaceFragmentsBackStack(int containerId,
			Fragment fragment) {

		if (fragment != null) {

			fragmentTransaction = fragmentManager.beginTransaction();
			fragmentTransaction
					.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			fragmentTransaction.replace(containerId, fragment)
					.addToBackStack(null).commit();
		}
	}

	public static void replaceFragmentsNoBackStack(int containerId,
			Fragment fragment) {

		if (fragment != null) {

			fragmentTransaction = fragmentManager.beginTransaction();
			fragmentTransaction
					.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			fragmentTransaction.replace(containerId, fragment).commit();
		}
	}

}