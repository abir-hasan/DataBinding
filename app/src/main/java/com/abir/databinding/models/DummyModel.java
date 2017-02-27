package com.abir.databinding.models;

import android.databinding.ObservableField;

/**
 * Created by Abir Hasan on 27-Feb-17.
 */

public class DummyModel {

    public ObservableField<String> name = new ObservableField<>();
    private String age;

    public void setName(String name) {
        this.name.set(name);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
