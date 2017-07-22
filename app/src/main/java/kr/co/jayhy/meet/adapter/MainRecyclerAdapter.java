package kr.co.jayhy.meet.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kr.co.jayhy.meet.R;
import kr.co.jayhy.meet.databinding.FragmentMainBinding;
import kr.co.jayhy.meet.databinding.FragmentMainItemBinding;
import kr.co.jayhy.meet.item.MeetInfoItem;

/**
 * Created by jhkim on 2017-07-02.
 */

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.ViewHolder>{

    private Context context = null;
    private List<MeetInfoItem> items = null;

    private FragmentMainItemBinding binding = null;

    private MainSubRecyclerAdapter subRecyclerAdapter = null;

    public MainRecyclerAdapter(Context context, List<MeetInfoItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_main_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        binding.title.setText(items.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);

            binding =  DataBindingUtil.bind(itemView);
            LinearLayoutManager layoutManager = new LinearLayoutManager(context);
            layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            binding.subRecyclerView.setLayoutManager(layoutManager);

            subRecyclerAdapter = new MainSubRecyclerAdapter(context, items);
            binding.subRecyclerView.setAdapter(subRecyclerAdapter);

        }
    }
}
