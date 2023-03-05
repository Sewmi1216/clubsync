package com.example.clubsync.ui.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clubsync.R;
import com.example.clubsync.adapter.NewsAdapter;
import com.example.clubsync.databinding.FragmentExploreBinding;
import com.example.clubsync.model.News;
import com.example.clubsync.ui.news.NewsViewModel;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment {

    private List<String> newsList;
    private String[] newsHeading;
    private int[] newsImg;
    private RecyclerView recyclerview;
    private NewsAdapter adapterItem;

    public void onCreateView( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        recyclerview = view.findViewById(R.id. recycler_view);
        newsList = new ArrayList<>();

        newsHeading = new String[]{
                getString(R.string.news1),
                getString(R.string.news2),
                getString(R.string.news3),
                getString(R.string.news4),
                getString(R.string.news5),
                getString(R.string.news6),
                getString(R.string.news7),
                getString(R.string.news8),
        };
        newsImg = new int[]{
                R.drawable.peakpx,
                R.drawable.peakpx,
                R.drawable.peakpx,
                R.drawable.peakpx,
                R.drawable.peakpx,
                R.drawable.peakpx,
                R.drawable.peakpx,
                R.drawable.peakpx,
        };
        for (int i=0; i<newsHeading.length; i++){
            News news = new News(newsHeading[i], newsImg[i]);
            newsList.add(String.valueOf(news));
        }
        adapterItem = new NewsAdapter(newsList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerview.setLayoutManager(linearLayoutManager);
        recyclerview.setAdapter(adapterItem);
        return view;


    }

}