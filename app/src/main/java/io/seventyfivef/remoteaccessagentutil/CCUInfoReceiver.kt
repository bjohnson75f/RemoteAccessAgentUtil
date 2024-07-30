package io.seventyfivef.remoteaccessagentutil

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class CCUInfoReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("RAUtil", "Broadcast received $intent")
        if (intent?.action.equals("com.remote.REQUEST_CCU_REF")) {
            Log.d("RAUtil", "Received request for CCUref")
            val responseIntent = Intent("com.remote.SEND_CCU_REF")

            // Bills CCU data (for example purposes only, do not use!!)

            // Create your own settings here!!!
            responseIntent.putExtra("siteId", "80a178f1-9617-4c3d-aa1a-d014273f0069")
            responseIntent.putExtra("ccuId", "20a180a5-c609-4434-b3eb-b3769ace77fc")
            responseIntent.putExtra("ccuName", "Bills Rockchip CCU Take 2")
            responseIntent.putExtra("bearerToken", "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJkZXZpY2VJZCI6IkAyMGExODBhNS1jNjA5LTQ0MzQtYjNlYi1iMzc2OWFjZTc3ZmMiLCJzaXRlSWQiOiJAODBhMTc4ZjEtOTYxNy00YzNkLWFhMWEtZDAxNDI3M2YwMDY5Iiwib3JnSWQiOiI0NjAzOWU5OC01MmQ3LTRkMGUtOWVjMC0yZGRkZTliYjcxMGQiLCJvcmdOYW1lIjoiQmlsbHNPcmcgMjAyNDA3MjQiLCJpYXQiOjE3MjE4MzExNzgsImV4cCI6MTcyNzAxNTE3OCwiaXNzIjoiNzVmIn0.DxWZiaJ3XuwsVGUQ4wozbZCiJnY74Y4MU0__xMlgy__FjLuog9iwjB1WaU1WyI9FYJy-SZu-7mTjKiKD_0RCW56REzKWr5TS4elSJ2lZ8Yh0oiUh2YBVMk02I0Hy10v8Ug-zv6pL8chWwsvtDYHFI5j8Huf__0UQH3-rkWIgaCtlBlz1_EP7aG4-D-ciIa9dCPV-lhPjoUTnwqEVHGctAVLlb5OJy9tFwXnGAXllt-KaDpWAx_yqAfv4L5Cq9XOSAmW19RAHfhwOwtYov2hzBYUU_g0RIfWvgH78aM-nOCocfFwAJOmMqMUW0HteJZ5XTlQuRHFMcUVfDPwpbxfsDw")

            context?.sendBroadcast(responseIntent)
        }
    }
}