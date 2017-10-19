package com.ciopec.vremea;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by a626983 on 20.07.2017.
 */

public class AlertDialogFragment extends DialogFragment {
    private String errorMessage;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(R.string.error_title)
                .setMessage(getErrorMessage())
                .setPositiveButton(R.string.error_ok_button_text,null);
        AlertDialog dialog = builder.create();
        return dialog;
    }


    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
