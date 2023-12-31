package com.hacktiv8.joyshop.ui.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hacktiv8.joyshop.R;
import com.hacktiv8.joyshop.databinding.FragmentGithubBinding;


public class GithubFragment extends Fragment {
    private FragmentGithubBinding binding;

    public GithubFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGithubBinding.inflate(inflater, container, false);

        binding.githubEwi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openUrl(""); }
        });

        binding.githubfifit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openUrl(""); }
        });

        binding.githubRifqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openUrl(""); }
        });
        return binding.getRoot();
    }

    private void openUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}