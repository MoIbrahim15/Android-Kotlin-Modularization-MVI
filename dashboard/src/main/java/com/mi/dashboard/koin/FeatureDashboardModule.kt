package com.mi.dashboard.koin

import com.mi.dashboard.DashboardViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureDashboardModule = module {
    viewModel { DashboardViewModel() }
}
