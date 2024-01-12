package com.stmik.beritaumy

import android.view.View

interface RecyclerViewClickListener {
    fun onItemClickListener(view: View, book: Book)
}