package com.ichi2.anki.p2p

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.ichi2.anki.SingleFragmentActivity
import com.ichi2.anki.libanki.DeckId

class P2PShareFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ) = TextView(requireContext()).apply {
        text = "Teilen mit Freunden\n\nDeck ID: ${requireArguments().getLong("deck_id")}\n\n Hier könnte ihre Werbung/QRcode stehen"
        textSize = 22f
        gravity = Gravity.CENTER
    }

    companion object {
        fun getIntent(
            context: Context,
            deckId: DeckId,
        ) = SingleFragmentActivity.getIntent(
            context,
            P2PShareFragment::class,
            Bundle().apply { putLong("deck_id", deckId) },
        )
    }
}
