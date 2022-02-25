// Generated by view binder compiler. Do not edit!
package com.example.myapplication1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Activity3Binding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageButton appointment;

  @NonNull
  public final ImageButton buymedicine;

  @NonNull
  public final TextView dash;

  @NonNull
  public final ImageButton diet;

  @NonNull
  public final ImageButton myaccount;

  @NonNull
  public final ImageButton onlineyoga;

  private Activity3Binding(@NonNull ScrollView rootView, @NonNull ImageButton appointment,
      @NonNull ImageButton buymedicine, @NonNull TextView dash, @NonNull ImageButton diet,
      @NonNull ImageButton myaccount, @NonNull ImageButton onlineyoga) {
    this.rootView = rootView;
    this.appointment = appointment;
    this.buymedicine = buymedicine;
    this.dash = dash;
    this.diet = diet;
    this.myaccount = myaccount;
    this.onlineyoga = onlineyoga;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static Activity3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Activity3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Activity3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appointment;
      ImageButton appointment = ViewBindings.findChildViewById(rootView, id);
      if (appointment == null) {
        break missingId;
      }

      id = R.id.buymedicine;
      ImageButton buymedicine = ViewBindings.findChildViewById(rootView, id);
      if (buymedicine == null) {
        break missingId;
      }

      id = R.id.dash;
      TextView dash = ViewBindings.findChildViewById(rootView, id);
      if (dash == null) {
        break missingId;
      }

      id = R.id.diet;
      ImageButton diet = ViewBindings.findChildViewById(rootView, id);
      if (diet == null) {
        break missingId;
      }

      id = R.id.myaccount;
      ImageButton myaccount = ViewBindings.findChildViewById(rootView, id);
      if (myaccount == null) {
        break missingId;
      }

      id = R.id.onlineyoga;
      ImageButton onlineyoga = ViewBindings.findChildViewById(rootView, id);
      if (onlineyoga == null) {
        break missingId;
      }

      return new Activity3Binding((ScrollView) rootView, appointment, buymedicine, dash, diet,
          myaccount, onlineyoga);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
