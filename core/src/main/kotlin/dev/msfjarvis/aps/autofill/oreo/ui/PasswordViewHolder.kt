/*
 * Copyright © 2014-2020 The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */
package dev.msfjarvis.aps.autofill.oreo.ui

import dev.msfjarvis.aps.R
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PasswordViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val title: TextView = itemView.findViewById(R.id.title)
    val subtitle: TextView = itemView.findViewById(R.id.subtitle)
}
