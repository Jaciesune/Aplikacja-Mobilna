// Generated by view binder compiler. Do not edit!
package com.example.explorex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.explorex.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView loginNow;

  @NonNull
  public final MaterialButton regButton;

  @NonNull
  public final EditText regEmail;

  @NonNull
  public final EditText regPassword1;

  @NonNull
  public final EditText regPassword2;

  @NonNull
  public final TextView zarejestrujSie;

  private ActivityRegisterBinding(@NonNull RelativeLayout rootView, @NonNull TextView loginNow,
      @NonNull MaterialButton regButton, @NonNull EditText regEmail, @NonNull EditText regPassword1,
      @NonNull EditText regPassword2, @NonNull TextView zarejestrujSie) {
    this.rootView = rootView;
    this.loginNow = loginNow;
    this.regButton = regButton;
    this.regEmail = regEmail;
    this.regPassword1 = regPassword1;
    this.regPassword2 = regPassword2;
    this.zarejestrujSie = zarejestrujSie;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.login_now;
      TextView loginNow = ViewBindings.findChildViewById(rootView, id);
      if (loginNow == null) {
        break missingId;
      }

      id = R.id.reg_button;
      MaterialButton regButton = ViewBindings.findChildViewById(rootView, id);
      if (regButton == null) {
        break missingId;
      }

      id = R.id.reg_email;
      EditText regEmail = ViewBindings.findChildViewById(rootView, id);
      if (regEmail == null) {
        break missingId;
      }

      id = R.id.reg_password_1;
      EditText regPassword1 = ViewBindings.findChildViewById(rootView, id);
      if (regPassword1 == null) {
        break missingId;
      }

      id = R.id.reg_password_2;
      EditText regPassword2 = ViewBindings.findChildViewById(rootView, id);
      if (regPassword2 == null) {
        break missingId;
      }

      id = R.id.zarejestruj_sie;
      TextView zarejestrujSie = ViewBindings.findChildViewById(rootView, id);
      if (zarejestrujSie == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((RelativeLayout) rootView, loginNow, regButton, regEmail,
          regPassword1, regPassword2, zarejestrujSie);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}