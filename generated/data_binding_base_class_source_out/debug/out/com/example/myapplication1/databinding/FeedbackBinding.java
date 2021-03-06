// Generated by view binder compiler. Do not edit!
package com.example.myapplication1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
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

public final class FeedbackBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView tvRateCount;

  @NonNull
  public final TextView tvRateMessage;

  private FeedbackBinding(@NonNull ConstraintLayout rootView, @NonNull RatingBar ratingBar,
      @NonNull TextView textView13, @NonNull TextView tvRateCount,
      @NonNull TextView tvRateMessage) {
    this.rootView = rootView;
    this.ratingBar = ratingBar;
    this.textView13 = textView13;
    this.tvRateCount = tvRateCount;
    this.tvRateMessage = tvRateMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FeedbackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FeedbackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.feedback, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FeedbackBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ratingBar;
      RatingBar ratingBar = ViewBindings.findChildViewById(rootView, id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.tvRateCount;
      TextView tvRateCount = ViewBindings.findChildViewById(rootView, id);
      if (tvRateCount == null) {
        break missingId;
      }

      id = R.id.tvRateMessage;
      TextView tvRateMessage = ViewBindings.findChildViewById(rootView, id);
      if (tvRateMessage == null) {
        break missingId;
      }

      return new FeedbackBinding((ConstraintLayout) rootView, ratingBar, textView13, tvRateCount,
          tvRateMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
