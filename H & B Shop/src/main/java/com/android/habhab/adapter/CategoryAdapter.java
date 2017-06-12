package com.android.habhab.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.habhab.constant.Constant;
import com.android.habhab.model.Category;
import com.android.habhab.model.Product;
import com.android.tonyvu.sc.demo.R;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends BaseAdapter {
    private static final String TAG = "CategoryAdapter";

    private List<Category> categories = new ArrayList<Category>();

    private final Context context;

    public CategoryAdapter(Context context) {
        this.context = context;
    }

    public void updateCategories(List<Category> categories) {
        this.categories.addAll(categories);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Category getItem(int position) {
        return categories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tvName;
        TextView tvPrice;
        ImageView ivImage;
        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.adapter_product, parent, false);
            tvName = (TextView) convertView.findViewById(R.id.tvProductName);
            tvPrice = (TextView) convertView.findViewById(R.id.tvProductPrice);
            ivImage = (ImageView) convertView.findViewById(R.id.ivProductImage);
            convertView.setTag(new ViewHolder(tvName, tvPrice, ivImage));
        } else {
            ViewHolder viewHolder = (ViewHolder) convertView.getTag();
            tvName = viewHolder.tvCategoryName;
            tvPrice = viewHolder.tvCategoryPrice;
            ivImage = viewHolder.ivCategoryImage;
        }

        final Category category = getItem(position);
        tvName.setText(category.getName());
        tvPrice.setText(Constant.CURRENCY+String.valueOf(category.getPrice().setScale(2, BigDecimal.ROUND_HALF_UP)));
        Log.d(TAG, "Context package name: " + context.getPackageName());
        ivImage.setImageResource(context.getResources().getIdentifier(
                category.getImageName(), "drawable", context.getPackageName()));
//        bView.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, ProductActivity.class);
//                Bundle bundle = new Bundle();
//                bundle.putSerializable("product", product);
//                Log.d(TAG, "This product hashCode: " + product.hashCode());
//                intent.putExtras(bundle);
//                context.startActivity(intent);
//            }
//        });

        return convertView;
    }

    private static class ViewHolder {
        public final TextView tvCategoryName;
        public final TextView tvCategoryPrice;
        public final ImageView ivCategoryImage;

        public ViewHolder(TextView tvCategoryName, TextView tvCategoryPrice, ImageView ivCategoryImage) {
            this.tvCategoryName = tvCategoryName;
            this.tvCategoryPrice = tvCategoryPrice;
            this.ivCategoryImage = ivCategoryImage;
        }
    }
}
