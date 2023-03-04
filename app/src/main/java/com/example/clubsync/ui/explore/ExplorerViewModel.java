package com.example.clubsync.ui.explore;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExplorerViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ExplorerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is explorer fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}