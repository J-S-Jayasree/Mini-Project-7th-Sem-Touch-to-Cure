// Generated by view binder compiler. Do not edit!
package com.example.myapplication1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BuyMedicineBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatButton button4;

  @NonNull
  public final CheckBox cart1;

  @NonNull
  public final CheckBox cart2;

  @NonNull
  public final CheckBox cart3;

  @NonNull
  public final CheckBox cart4;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ViewFlipper vFlipper;

  private BuyMedicineBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatButton button4,
      @NonNull CheckBox cart1, @NonNull CheckBox cart2, @NonNull CheckBox cart3,
      @NonNull CheckBox cart4, @NonNull ImageView imageView2, @NonNull ImageView imageView3,
      @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ViewFlipper vFlipper) {
    this.rootView = rootView;
    this.button4 = button4;
    this.cart1 = cart1;
    this.cart2 = cart2;
    this.cart3 = cart3;
    this.cart4 = cart4;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.vFlipper = vFlipper;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BuyMedicineBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BuyMedicineBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.buy_medicine, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BuyMedicineBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button4;
      AppCompatButton button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.cart1;
      CheckBox cart1 = ViewBindings.findChildViewById(rootView, id);
      if (cart1 == null) {
        break missingId;
      }

      id = R.id.cart2;
      CheckBox cart2 = ViewBindings.findChildViewById(rootView, id);
      if (cart2 == null) {
        break missingId;
      }

      id = R.id.cart3;
      CheckBox cart3 = ViewBindings.findChildViewById(rootView, id);
      if (cart3 == null) {
        break missingId;
      }

      id = R.id.cart4;
      CheckBox cart4 = ViewBindings.findChildViewById(rootView, id);
      if (cart4 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.v_flipper;
      ViewFlipper vFlipper = ViewBindings.findChildViewById(rootView, id);
      if (vFlipper == null) {
        break missingId;
      }

      return new BuyMedicineBinding((RelativeLayout) rootView, button4, cart1, cart2, cart3, cart4,
          imageView2, imageView3, imageView4, imageView5, vFlipper);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
