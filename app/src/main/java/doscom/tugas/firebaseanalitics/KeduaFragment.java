package doscom.tugas.firebaseanalitics;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class KeduaFragment extends Fragment {

private Button btnUbah;
private TextView textView;
private View pertma;
    public KeduaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       pertma = inflater.inflate(R.layout.fragment_kedua, container, false);
       btnUbah = pertma.findViewById(R.id.btn_ubah);
//       textView = pertma.findViewById(R.id.tv_text);
       btnUbah.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               textView.setText(Constant.TEXT);
           }
       });
       return pertma;
    }

}
