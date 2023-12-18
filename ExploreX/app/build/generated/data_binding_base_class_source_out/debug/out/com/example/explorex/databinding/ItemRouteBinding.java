// Generated by view binder compiler. Do not edit!
package com.example.explorex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.explorex.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRouteBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton btnDelete;

  @NonNull
  public final TextView tvRoute;

  private ItemRouteBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton btnDelete,
      @NonNull TextView tvRoute) {
    this.rootView = rootView;
    this.btnDelete = btnDelete;
    this.tvRoute = tvRoute;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRouteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRouteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_route, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRouteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDelete;
      ImageButton btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.tvRoute;
      TextView tvRoute = ViewBindings.findChildViewById(rootView, id);
      if (tvRoute == null) {
        break missingId;
      }

      return new ItemRouteBinding((RelativeLayout) rootView, btnDelete, tvRoute);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}