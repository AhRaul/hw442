package ru.reliableteam.hw442.cyclefragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import ru.reliableteam.hw442.R;

public class CycleFragment extends Fragment implements View.OnClickListener {

    private String TAG = "[CycleFragment]";
    private TextView firstRunTextView;
    private EditText editText;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        makeMessage("onCreate()");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cycle,container,false);

        firstRunTextView = (TextView) v.findViewById(R.id.textViewInfo);
        editText = (EditText) v.findViewById(R.id.editText);
        Button buttonExit = (Button) v.findViewById(R.id.buttonExit);

        if (savedInstanceState == null){
            firstRunTextView.setText("Первый запуск!");
        } else {
            firstRunTextView.setText("Повторный запуск!");
        }

        makeMessage("onCreateView()");

        buttonExit.setOnClickListener(this);
        return v;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        makeMessage("onSaveInstanceState()");
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        makeMessage("onActivityResult()");
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        makeMessage("onRequestPermissionsResult()");
    }

    @Override
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attrs, @Nullable Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
        makeMessage("onInflate()");
    }

    @Override
    public void onAttachFragment(@NonNull Fragment childFragment) {
        super.onAttachFragment(childFragment);
        makeMessage("onAttachFragment()");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        makeMessage("onAttach()");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        makeMessage("onActivityCreated()");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        makeMessage("onViewStateRestored()");
    }

    @Override
    public void onStart() {
        super.onStart();
        makeMessage("onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        makeMessage("onResume()");
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
        makeMessage("onMultiWindowModeChanged()");
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        makeMessage("onPictureInPictureModeChanged()");
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        makeMessage("onConfigurationChanged()");
    }

    @Override
    public void onPrimaryNavigationFragmentChanged(boolean isPrimaryNavigationFragment) {
        super.onPrimaryNavigationFragmentChanged(isPrimaryNavigationFragment);
        makeMessage("onPrimaryNavigationFragmentChanged()");
    }

    @Override
    public void onPause() {
        super.onPause();
        makeMessage("onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        makeMessage("onStop()");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        makeMessage("onLowMemory()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        makeMessage("onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        makeMessage("onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        makeMessage("onDetach()");
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        makeMessage("onCreateOptionsMenu()");
    }

    @Override
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
        super.onPrepareOptionsMenu(menu);
        makeMessage("onPrepareOptionsMenu()");
    }

    @Override
    public void onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
        makeMessage("onDestroyOptionsMenu()");
    }

    @Override
    public void onOptionsMenuClosed(@NonNull Menu menu) {
        super.onOptionsMenuClosed(menu);
        makeMessage("onOptionsMenuClosed()");
    }

    @Override
    public void onCreateContextMenu(@NonNull ContextMenu menu, @NonNull View v, @Nullable ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        makeMessage("onCreateContextMenu()");
    }

    private void makeMessage(String message){
        Toast.makeText(getActivity().getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        Log.i(TAG, message);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonExit:
                makeMessage("summon finish");
                getActivity().finish();
                break;
            default:
                break;
        }
    }
}
