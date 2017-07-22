package kr.co.jayhy.meet;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kr.co.jayhy.meet.adapter.MainRecyclerAdapter;
import kr.co.jayhy.meet.common.CommonValues;
import kr.co.jayhy.meet.databinding.FragmentMainBinding;
import kr.co.jayhy.meet.item.MeetInfoItem;

/**
 * Created by jhkim on 2017-07-02.
 */

public class MainFragment extends Fragment {

    private FragmentMainBinding binding = null;
    private MainRecyclerAdapter recyclerAdapter = null;
    private List<MeetInfoItem> meetItems = null;

    private int position = 0;

    public MainFragment() {

    }

    public static MainFragment newInstance(int page) {
        MainFragment fragmentFirst = new MainFragment();
        Bundle args = new Bundle();
        args.putInt("position" , page);
        fragmentFirst.setArguments(args);

        return fragmentFirst;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_main, null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.d("jayHy", "onActivityCreated =>");

        /**
         * Bundle request parameter
         */
        if(getArguments() != null) {
            position = getArguments().getInt("position");
            Log.d(CommonValues.TAG, "MainFragment positon ==> " + position);
        }

        binding = FragmentMainBinding.bind(getView());
        meetItems = new ArrayList<MeetInfoItem>();

        for(int i=0; i<20; i++) {
            MeetInfoItem item = new MeetInfoItem();
            item.setTitle(String.valueOf(position));
            meetItems.add(item);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.mainRecyclerView.setLayoutManager(gridLayoutManager);

        recyclerAdapter = new MainRecyclerAdapter(getActivity(), meetItems);
        binding.mainRecyclerView.setAdapter(recyclerAdapter);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

}
