package kr.co.jayhy.meet.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kr.co.jayhy.meet.R;
import kr.co.jayhy.meet.databinding.FragmentMainSubItemBinding;
import kr.co.jayhy.meet.item.MeetInfoItem;

/**
 * Created by jhkim on 2017-07-21.
 */

public class MainSubRecyclerAdapter extends RecyclerView.Adapter<MainSubRecyclerAdapter.ViewHolder> {

    private Context context = null;
    private FragmentMainSubItemBinding binding = null;
    private List<MeetInfoItem> items = null;

    public MainSubRecyclerAdapter(Context context, List<MeetInfoItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_main_sub_item, parent, false);

        return new MainSubRecyclerAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        binding.subTitle.setText(items.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);

            binding =  DataBindingUtil.bind(itemView);

        }
    }

}
