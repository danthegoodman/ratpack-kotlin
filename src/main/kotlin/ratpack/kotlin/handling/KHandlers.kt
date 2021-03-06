package ratpack.kotlin.handling

import ratpack.handling.Handler

object KHandlers {

    @JvmStatic fun from(cb: KContext.() -> Unit) : Handler = { ctx: KContext ->  cb(ctx) } as Handler
}