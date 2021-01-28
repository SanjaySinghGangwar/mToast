package com.theraverageguy.mtoast;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class mToast {

    public static void error(Context context) {
        Toast toast = Toast.makeText(context, "Something went wrong !!", Toast.LENGTH_LONG);
        View view = toast.getView();
        view.getBackground().setColorFilter(context.getResources().getColor(R.color.colorRed), PorterDuff.Mode.SRC_IN);
        TextView text = view.findViewById(android.R.id.message);
        text.getTextSize();
        text.setTextColor(context.getResources().getColor(R.color.colorWhite));
        toast.show();
    }

    public static void errorMessage(Context context, String Message) {
        Toast toast = Toast.makeText(context, Message, Toast.LENGTH_LONG);
        View view = toast.getView();
        view.getBackground().setColorFilter(context.getResources().getColor(R.color.colorRed), PorterDuff.Mode.SRC_IN);
        TextView text = view.findViewById(android.R.id.message);
        text.getTextSize();
        text.setTextColor(context.getResources().getColor(R.color.colorWhite));
        toast.show();
    }

    public static void Show(Context context, String Message) {
        Toast toast = Toast.makeText(context, Message, Toast.LENGTH_LONG);
        View view = toast.getView();
        TextView text = view.findViewById(android.R.id.message);
        text.getTextSize();
        text.setTextColor(context.getResources().getColor(R.color.colorWhite));
        toast.show();
    }

    public static void success(Context context) {
        Toast toast = Toast.makeText(context, "Success ", Toast.LENGTH_LONG);
        View view = toast.getView();
        view.getBackground().setColorFilter(context.getResources().getColor(R.color.colorLightGreen), PorterDuff.Mode.SRC_IN);
        TextView text = view.findViewById(android.R.id.message);
        text.getTextSize();
        text.setTextColor(context.getResources().getColor(R.color.colorWhite));
        toast.show();
    }

    public static void successMessage(Context context, String Message) {
        Toast toast = Toast.makeText(context, Message, Toast.LENGTH_LONG);
        View view = toast.getView();
        view.getBackground().setColorFilter(context.getResources().getColor(R.color.colorLightGreen), PorterDuff.Mode.SRC_IN);
        TextView text = view.findViewById(android.R.id.message);
        text.getTextSize();
        text.setTextColor(context.getResources().getColor(R.color.colorWhite));
        toast.show();
    }

    public static void checker(Context context) {
        Toast.makeText(context, "I am alive !! ", Toast.LENGTH_LONG).show();
    }

    public static void custom(Context context, String message, int BackgroundColor, int textColor) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        View view = toast.getView();
        view.getBackground().setColorFilter(BackgroundColor, PorterDuff.Mode.SRC_IN);
        TextView text = view.findViewById(android.R.id.message);
        text.getTextSize();
        text.setTextColor(textColor);
        toast.show();
    }

}
