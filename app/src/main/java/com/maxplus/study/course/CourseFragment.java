package com.maxplus.study.course;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sostudy.R;

public class CourseFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container, Bundle savedInstanceState) {

		return inflater.inflate(R.layout.fragment_course, null);
	}
}
