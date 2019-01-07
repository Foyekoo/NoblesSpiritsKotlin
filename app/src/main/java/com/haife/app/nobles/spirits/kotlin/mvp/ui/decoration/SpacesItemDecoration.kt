package com.haife.app.nobles.spirits.kotlin.mvp.ui.decoration

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 *
 * TODO：水平方向的RecycleView分割线
 */
class SpacesItemDecoration(val spaceItem: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        super.getItemOffsets(outRect, view, parent, state)
        if (parent!!.getChildLayoutPosition(view) == 0) {
            outRect?.left = spaceItem
            outRect?.right = spaceItem
        } else {
            outRect?.right = spaceItem
        }
    }

}