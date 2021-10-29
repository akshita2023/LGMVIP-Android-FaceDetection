package com.example.facedetection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ResultDialog extends DialogFragment {
    Button okBtn;
    TextView resultTextView;

    @Nullable
    @Override
    public View
    onCreateView(@NonNull LayoutInflater inflater,
                 @Nullable ViewGroup container,
                 @Nullable Bundle savedInstanceState)
    {

        View view = inflater.inflate(
                R.layout.resultdialog, container,
                false);
        String resultText;
        okBtn = view.findViewById(R.id.result_ok_button);
        resultTextView
                = view.findViewById(R.id.result_view);


        Bundle bundle = getArguments();
        resultText = bundle.getString(
                FaceDet.RESULT_TEXT);
        resultTextView.setText(resultText);


        okBtn.setOnClickListener(
                this::onClick);
        return view;
    }

    private void onClick(View v) {
        dismiss();
    }
}