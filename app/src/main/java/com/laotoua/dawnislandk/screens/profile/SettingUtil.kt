/*
 *  Copyright 2020 Fishballzzz
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.laotoua.dawnislandk.screens.profile

import android.widget.Toast
import androidx.fragment.app.Fragment
import com.laotoua.dawnislandk.R
import com.laotoua.dawnislandk.databinding.ListItemPreferenceBinding


fun ListItemPreferenceBinding.updateSwitchSummary(summaryOn: Int, summaryOff: Int) {
    if (preferenceSwitch.isChecked) {
        summary.setText(summaryOn)
    } else {
        summary.setText(summaryOff)
    }
}

fun Fragment.displayRestartToApplySettingsToast() {
    Toast.makeText(context, R.string.restart_to_apply_setting, Toast.LENGTH_SHORT).show()
}