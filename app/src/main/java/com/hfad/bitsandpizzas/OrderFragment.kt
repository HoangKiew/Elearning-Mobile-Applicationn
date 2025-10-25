package com.hfad.bitsandpizzas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.chip.Chip
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class OrderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_order, container, false)

        // Thiết lập Toolbar
        val toolbar = view.findViewById<MaterialToolbar>(R.id.toolbar)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        // Thiết lập OnClickListener cho FAB
        val fab = view.findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val pizzaGroup = view.findViewById<RadioGroup>(R.id.pizza_group)
            val pizzaType = pizzaGroup.checkedRadioButtonId

            if (pizzaType == -1) {
                // Nếu chưa chọn loại pizza
                val text = "You need to choose a pizza type" // Nên dùng string resource
                Toast.makeText(activity, text, Toast.LENGTH_LONG).show()
            } else {
                // Nếu đã chọn loại pizza
                var text = (when (pizzaType) {
                    R.id.radio_diavolo -> "Diavolo pizza" // Nên dùng string resource
                    else -> "Funghi pizza" // Nên dùng string resource
                })

                // Kiểm tra các Chip extras
                val parmesan = view.findViewById<Chip>(R.id.parmesan)
                text += if (parmesan.isChecked) ", extra parmesan" else "" // Nên dùng string resource
                val chiliOil = view.findViewById<Chip>(R.id.chili_oil)
                text += if (chiliOil.isChecked) ", extra chili oil" else "" // Nên dùng string resource

                // Hiển thị Snackbar với thông tin đơn hàng
                Snackbar.make(fab, text, Snackbar.LENGTH_LONG).show()
            }
        }
        return view
    }
}