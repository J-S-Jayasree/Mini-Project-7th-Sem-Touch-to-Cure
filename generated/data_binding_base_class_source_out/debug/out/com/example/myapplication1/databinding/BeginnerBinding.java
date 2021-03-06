// Generated by view binder compiler. Do not edit!
package com.example.myapplication1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BeginnerBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout activityMain;

  @NonNull
  public final AppCompatButton beg1;

  @NonNull
  public final AppCompatButton beg2;

  @NonNull
  public final AppCompatButton beg3;

  @NonNull
  public final AppCompatButton beg4;

  private BeginnerBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout activityMain,
      @NonNull AppCompatButton beg1, @NonNull AppCompatButton beg2, @NonNull AppCompatButton beg3,
      @NonNull AppCompatButton beg4) {
    this.rootView = rootView;
    this.activityMain = activityMain;
    this.beg1 = beg1;
    this.beg2 = beg2;
    this.beg3 = beg3;
    this.beg4 = beg4;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BeginnerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BeginnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.beginner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BeginnerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout activityMain = (RelativeLayout) rootView;

      id = R.id.beg1;
      AppCompatButton beg1 = ViewBindings.findChildViewById(rootView, id);
      if (beg1 == null) {
        break missingId;
      }

      id = R.id.beg2;
      AppCompatButton beg2 = ViewBindings.findChildViewById(rootView, id);
      if (beg2 == null) {
        break missingId;
      }

      id = R.id.beg3;
      AppCompatButton beg3 = ViewBindings.findChildViewById(rootView, id);
      if (beg3 == null) {
        break missingId;
      }

      id = R.id.beg4;
      AppCompatButton beg4 = ViewBindings.findChildViewById(rootView, id);
      if (beg4 == null) {
        break missingId;
      }

      return new BeginnerBinding((RelativeLayout) rootView, activityMain, beg1, beg2, beg3, beg4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
