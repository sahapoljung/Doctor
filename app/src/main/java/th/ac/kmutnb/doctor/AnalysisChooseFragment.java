package th.ac.kmutnb.doctor;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnalysisChooseFragment extends Fragment implements View.OnClickListener {


    public AnalysisChooseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        sick1();
        sick2();
        sick3();
        sick4();
    }

    private void sick1() {
        TextView textView = getView().findViewById(R.id.txtsick1);
        textView.setOnClickListener(this);
    }

    private void sick2() {
        TextView textView = getView().findViewById(R.id.txtsick2);
        textView.setOnClickListener(this);
    }

    private void sick3() {
        TextView textView = getView().findViewById(R.id.txtsick3);
        textView.setOnClickListener(this);
    }

    private void sick4() {
        TextView textView = getView().findViewById(R.id.txtsick4);
        textView.setOnClickListener(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_analysis_choose, container, false);
    }

    @Override
    public void onClick(View v) {
        int index = 0;
        switch (v.getId()) {
            case R.id.txtsick1:
                index = 1;
                break;
            case R.id.txtsick2:
                index = 1;
                break;
            case R.id.txtsick3:
                index = 1;
                break;
            case R.id.txtsick4:
                index = 1;
                break;
        }


        Intent intent = new Intent(getActivity(), AnalysisActivity.class);
        intent.putExtra("index", index);

    }
}
