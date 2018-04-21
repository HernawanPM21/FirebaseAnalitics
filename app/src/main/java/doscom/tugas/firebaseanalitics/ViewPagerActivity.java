package doscom.tugas.firebaseanalitics;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager vpViewPager;
    private TabLayout tlViewPager;
    private ViewPaggerAdapter adapter;
    private  PertamaFragment pertamaF;
    private  KeduaFragment keduaF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        tlViewPager = findViewById(R.id.tl_view_pager);
        vpViewPager = findViewById(R.id.vp_view_pager);
        setViewPager();

    }
    private void setViewPager(){

        adapter = new ViewPaggerAdapter(getSupportFragmentManager());
        pertamaF = new PertamaFragment();
        keduaF = new KeduaFragment();
        adapter.addFragment(pertamaF);
        adapter.addFragment(keduaF);

        vpViewPager.setAdapter(adapter);
        tlViewPager.setupWithViewPager(vpViewPager);

    }
}
