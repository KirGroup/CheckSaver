package dev.kirillbalanov.check_sample.model;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import dev.kirillbalanov.check_sample.R;
import dev.kirillbalanov.check_sample.pojo.Check;

public class ChecksAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private List<Check> checks = new ArrayList<>();

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.check_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.checkValue.setText(checks.get(position).getAllValues());
    }

    @Override
    public int getItemCount() {
        return checks.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void addChecks(List<Check> checks){
            this.checks = checks;
            notifyDataSetChanged();
    }
}