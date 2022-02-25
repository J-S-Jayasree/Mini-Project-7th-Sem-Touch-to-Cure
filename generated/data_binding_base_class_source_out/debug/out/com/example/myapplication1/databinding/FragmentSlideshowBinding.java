// Generated by view binder compiler. Do not edit!
package com.example.myapplication1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSlideshowBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button feed;

  @NonNull
  public final TextView textSlideshow;

  private FragmentSlideshowBinding(@NonNull ConstraintLayout rootView, @NonNull Button feed,
      @NonNull TextView textSlideshow) {
    this.rootView = rootView;
    this.feed = feed;
    this.textSlideshow = textSlideshow;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSlideshowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSlideshowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_slideshow, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSlideshowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.feed;
      Button feed = ViewBindings.findChildViewById(rootView, id);
      if (feed == null) {
        break missingId;
      }

      id = R.id.text_slideshow;
      TextView textSlideshow = ViewBindings.findChildViewById(rootView, id);
      if (textSlideshow == null) {
        break missingId;
      }

      return new FragmentSlideshowBinding((ConstraintLayout) rootView, feed, textSlideshow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}