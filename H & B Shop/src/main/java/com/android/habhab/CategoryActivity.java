package com.android.habhab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.habhab.adapter.CategoryAdapter;
import com.android.habhab.adapter.ProductAdapter;
import com.android.habhab.constant.Constant;
import com.android.habhab.model.Product;
import com.android.tonyvu.sc.demo.R;

public class CategoryActivity extends AppCompatActivity {
    private static final String TAG = "CategoryActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


        ListView lvCategory = (ListView) findViewById(R.id.lvCategory);
        lvCategory.addHeaderView(getLayoutInflater().inflate(R.layout.product_list_header, lvCategory, false));

        CategoryAdapter categoryAdapter = new CategoryAdapter(this);
        categoryAdapter.updateCategories(Constant.CATEGORY_LIST);

        lvCategory.setAdapter(categoryAdapter);

        lvCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Product product = Constant.PRODUCT_LIST.get(position - 1);
                Intent intent = new Intent(CategoryActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("categori", product);
                Log.d(TAG, "View product: " + product.getName());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}
