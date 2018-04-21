package doscom.tugas.firebaseanalitics;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by lind on 21/04/18.
 */

public class ViewPaggerAdapter extends FragmentPagerAdapter{
    private ArrayList<Fragment> fragments = new ArrayList<>();
    public ViewPaggerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        switch (position){
            case 0:
                return Constant.GAMBAR_1;
            case 1:
                return Constant.GAMBAR_2;
            default:
                return null;

        }

    }
    public void addFragment(Fragment fragment){
        fragments.add(fragment);
    }

}
