package br.com.leonardomiyagi.dialogutils

import android.content.Context
import android.support.annotation.StringRes
import android.support.v7.app.AlertDialog

/**
 * Created by lmiyagi on 12/06/18.
 */
object DialogUtils {

    /**
     * Shows an [AlertDialog] with only a positive button with an "OK" text. You may also set an
     * action for when the user cancels the Dialog by clicking outside.
     *
     * This Dialog uses the [android.R.string.ok] resource, so most languages supported by Android
     * should be shown accordingly.
     *
     * @param context the context the Dialog should be shown at
     * @param title a String Resource for the title (opt.)
     * @param message a String Resource for the message
     * @param okAction an action to perform if the user clicks "OK" (opt.)
     * @param cancelAction an action to perform if the user clicks outside the Dialog (opt.)
     */
    fun showOkDialog(context: Context,
                     @StringRes title: Int? = null,
                     @StringRes message: Int,
                     okAction: (() -> Unit)? = null,
                     cancelAction: (() -> Unit)? = null) {
        showOkDialog(context,
                title?.run { context.getString(this) },
                context.getString(message),
                okAction,
                cancelAction)
    }

    /**
     * Shows an [AlertDialog] with only a positive button with an "OK" text. You may also set an
     * action for when the user cancels the Dialog by clicking outside.
     *
     * This Dialog uses the [android.R.string.ok] resource, so most languages supported by Android
     * should be shown accordingly.
     *
     * @param context the context the Dialog should be shown at
     * @param title a String for the title (opt.)
     * @param message a String for the message
     * @param okAction an action to perform if the user clicks "OK" (opt.)
     * @param cancelAction an action to perform if the user clicks outside the Dialog (opt.)
     */
    fun showOkDialog(context: Context,
                     title: String? = null,
                     message: String,
                     okAction: (() -> Unit)? = null,
                     cancelAction: (() -> Unit)? = null) {
        showDialog(context = context,
                title = title,
                message = message,
                positiveMessage = context.getString(android.R.string.ok),
                positiveAction = okAction,
                cancelAction = cancelAction)
    }

    /**
     * Shows an [AlertDialog] with a positive button "OK", and a negative button "Cancel". You may
     * also set an action for when the user cancels the Dialog by clicking outside.
     *
     * This Dialog uses the [android.R.string.ok] and [android.R.string.cancel] resources, so most
     * languages supported by Android should be shown accordingly.
     *
     * @param context the context the Dialog should be shown at
     * @param title a String Resource for the title (opt.)
     * @param message a String Resource for the message
     * @param okAction an action to perform if the user clicks "OK" (opt.)
     * @param cancelAction an action to perform if the user clicks "Cancel" (opt.)
     * @param dialogCancelAction an action to perform if the user clicks outside the Dialog (opt.)
     */
    fun showOkCancelDialog(context: Context,
                           @StringRes title: Int? = null,
                           @StringRes message: Int,
                           okAction: (() -> Unit)? = null,
                           cancelAction: (() -> Unit)? = null,
                           dialogCancelAction: (() -> Unit)? = null) {
        showOkCancelDialog(context,
                title?.run { context.getString(this) },
                context.getString(message),
                okAction,
                cancelAction,
                dialogCancelAction)
    }

    /**
     * Shows an [AlertDialog] with a positive button "OK", and a negative button "Cancel". You may
     * also set an action for when the user cancels the Dialog by clicking outside.
     *
     * This Dialog uses the [android.R.string.ok] and [android.R.string.cancel] resources, so most
     * languages supported by Android should be shown accordingly.
     *
     * @param context the context the Dialog should be shown at
     * @param title a String for the title (opt.)
     * @param message a String for the message
     * @param okAction an action to perform if the user clicks "OK" (opt.)
     * @param cancelAction an action to perform if the user clicks "Cancel" (opt.)
     * @param dialogCancelAction an action to perform if the user clicks outside the Dialog (opt.)
     */
    fun showOkCancelDialog(context: Context,
                           title: String? = null,
                           message: String,
                           okAction: (() -> Unit)? = null,
                           cancelAction: (() -> Unit)? = null,
                           dialogCancelAction: (() -> Unit)? = null) {
        showDialog(context = context,
                title = title,
                message = message,
                positiveMessage = context.getString(android.R.string.ok),
                positiveAction = okAction,
                negativeMessage = context.getString(android.R.string.cancel),
                negativeAction = cancelAction,
                cancelAction = dialogCancelAction)
    }

    /**
     * Shows an [AlertDialog] with various customizable parameters. You may also set an action for
     * when the user cancels the Dialog by clicking outside.
     *
     * @param context the context the Dialog should be shown at
     * @param title a String Resource for the title (opt.)
     * @param message a String Resource for the message
     * @param positiveMessage a String Resource to be shown on the positive button
     * @param negativeMessage a String Resource to be shown on the negative button (opt.)
     * @param neutralMessage a String Resource to be shown on the neutral button (opt.)
     * @param positiveAction an action to perform if the user clicks the positive button (opt.)
     * @param negativeAction an action to perform if the user clicks the negative button (opt.)
     * @param neutralAction an action to perform if the user clicks the neutral button (opt.)
     * @param cancelAction an action to perform if the user clicks outside the Dialog (opt.)
     */
    fun showDialog(context: Context,
                   @StringRes title: Int? = null,
                   @StringRes message: Int,
                   @StringRes positiveMessage: Int,
                   @StringRes negativeMessage: Int? = null,
                   @StringRes neutralMessage: Int? = null,
                   positiveAction: (() -> Unit)? = null,
                   negativeAction: (() -> Unit)? = null,
                   neutralAction: (() -> Unit)? = null,
                   cancelAction: (() -> Unit)? = null) {
        showDialog(context,
                title?.run { context.getString(this) },
                context.getString(message),
                context.getString(positiveMessage),
                negativeMessage?.run { context.getString(this) },
                neutralMessage?.run { context.getString(this) },
                positiveAction,
                negativeAction,
                neutralAction,
                cancelAction)
    }

    /**
     * Shows an [AlertDialog] with various customizable parameters. You may also set an action for
     * when the user cancels the Dialog by clicking outside.
     *
     * @param context the context the Dialog should be shown at
     * @param title a String for the title (opt.)
     * @param message a String for the message
     * @param positiveMessage a String to be shown on the positive button
     * @param negativeMessage a String to be shown on the negative button (opt.)
     * @param neutralMessage a String to be shown on the neutral button (opt.)
     * @param positiveAction an action to perform if the user clicks the positive button (opt.)
     * @param negativeAction an action to perform if the user clicks the negative button (opt.)
     * @param neutralAction an action to perform if the user clicks the neutral button (opt.)
     * @param cancelAction an action to perform if the user clicks outside the Dialog (opt.)
     */
    fun showDialog(context: Context,
                   title: String? = null,
                   message: String,
                   positiveMessage: String,
                   negativeMessage: String? = null,
                   neutralMessage: String? = null,
                   positiveAction: (() -> Unit)? = null,
                   negativeAction: (() -> Unit)? = null,
                   neutralAction: (() -> Unit)? = null,
                   cancelAction: (() -> Unit)? = null) {
        val builder = AlertDialog.Builder(context)
        val dialog = builder.apply {
            title?.apply { setTitle(this) }
            setMessage(message)
            setPositiveButton(positiveMessage, { _, _ -> positiveAction?.invoke() })
            negativeMessage?.apply {
                setNegativeButton(this, { _, _ -> negativeAction?.invoke() })
            }
            neutralMessage?.apply {
                setNeutralButton(this, { _, _ -> neutralAction?.invoke() })
            }
            setOnCancelListener { cancelAction?.invoke() }
        }.create()
        dialog.setCanceledOnTouchOutside(true)
        dialog.show()
    }
}