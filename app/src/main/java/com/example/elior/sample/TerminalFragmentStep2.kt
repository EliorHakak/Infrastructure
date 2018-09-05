package com.example.elior.sample

import android.view.View
import android.widget.TextView
import com.example.elior.baseactivity.R
import com.example.elior.baseactivity.wizards.fragment.BaseWizardFragment
import com.example.elior.baseactivity.wizards.view.BottomConfig
import com.example.elior.sample.model.TestObject

class TerminalFragmentStep2 : BaseWizardFragment<TestObject>(){

    lateinit var text: TextView

    override fun initView(view: View) {
        super.initView(view)
        text = view.findViewById(R.id.step_2_text)
    }


    override fun collectData(t: TestObject?) {
        t?.password = "I WAS IN STEP 2"
    }


    override fun populate(t: TestObject?) {
        text.text = t?.username
    }


    override fun conditionSatisfied(): Boolean = true
    override fun getBottomConfig(): BottomConfig = BottomConfig.Builder().build()
    override fun getLayout(): Int = R.layout.terminal_fragment_step2

}