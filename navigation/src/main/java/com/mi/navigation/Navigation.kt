package com.mi.navigation

import android.content.Context
import android.content.Intent

object Navigation {
    fun openDashboard(context: Context, userId: String) =
        internalIntent(context, "com.mi.navigation.dashboard.open")
            .putExtra(EXTRA_USER, userId)
}

private fun internalIntent(context: Context, action: String) =
    Intent(action).setPackage(context.packageName)
