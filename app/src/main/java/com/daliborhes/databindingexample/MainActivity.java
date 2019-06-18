package com.daliborhes.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daliborhes.databindingexample.databinding.ActivityMainBinding;
import com.daliborhes.databindingexample.models.Product;
import com.daliborhes.databindingexample.util.Products;

public class MainActivity extends AppCompatActivity {

    // data Binding
    ActivityMainBinding mBinding;

    // vars
    private Product mProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Products products = new Products();
        mProduct = products.PRODUCTS[0];

        mBinding.setProduct(mProduct);
    }
}
