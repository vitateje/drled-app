package com.example.drled.statistics

import android.os.Bundle
import androidx.fragment.app.Fragment

/**
 * Required for transfer data between Fragments (communicate between Fragments)
 *
 * Data flow example: [StatisticsFragment] -> [MainActivity] -> [GraphsFragment]
 *
 * @author Mikolaj Ratajczyk <mikolaj.ratajczyk(AT)gmail.com>
 */
interface LoadingFragmentWithArgs {

    fun loadFragmentWithArgs(fragment: Fragment, bundle: Bundle)
}