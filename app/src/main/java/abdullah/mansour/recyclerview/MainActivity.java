package abdullah.mansour.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import abdullah.mansour.recyclerview.Models.model;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    List<model> models;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        models = new ArrayList<>();

        models.add(new model("Zainabo", R.drawable.ic_android_baby_blue_24dp));
        models.add(new model("Asmaa", R.drawable.ic_android_baby_blue_24dp));
        models.add(new model("Bassant 1", R.drawable.ic_android_baby_blue_24dp));
        models.add(new model("Bassant 2", R.drawable.ic_android_baby_blue_24dp));
        models.add(new model("Aml", R.drawable.ic_android_baby_blue_24dp));
        models.add(new model("Ahmed Talal", R.drawable.ic_android_baby_blue_24dp));

        models.add(new model("Zainabo", R.drawable.ic_android_baby_blue_24dp));
        models.add(new model("Asmaa", R.drawable.ic_android_baby_blue_24dp));
        models.add(new model("Bassant 1", R.drawable.ic_android_baby_blue_24dp));
        models.add(new model("Bassant 2", R.drawable.ic_android_baby_blue_24dp));
        models.add(new model("Aml", R.drawable.ic_android_baby_blue_24dp));
        models.add(new model("Ahmed Talal", R.drawable.ic_android_baby_blue_24dp));

        adapter = new Adapter(models);
        recyclerView.setAdapter(adapter);
    }

    public class Adapter extends RecyclerView.Adapter<Adapter.itemviewHolder>
    {
        List<model> models;

        Adapter(List<model> models)
        {
            this.models = models;
        }

        @NonNull
        @Override
        public itemviewHolder onCreateViewHolder(ViewGroup viewGroup, int i)
        {
            View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.item, viewGroup, false);
            return new itemviewHolder(view);
        }

        @Override
        public void onBindViewHolder(itemviewHolder viewHolder, int i)
        {
            final String name = models.get(i).getName();
            int image = models.get(i).getImage();

            viewHolder.textView.setText(name);
            viewHolder.imageView.setImageResource(image);

            viewHolder.imageView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount()
        {
            return models.size();
        }

        private class itemviewHolder extends RecyclerView.ViewHolder
        {
            ImageView imageView;
            TextView textView;

            private itemviewHolder(View itemView)
            {
                super(itemView);

                imageView = itemView.findViewById(R.id.image);
                textView = itemView.findViewById(R.id.text);
            }
        }
    }
}
