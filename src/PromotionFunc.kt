data class PromotionFuncArgs(val addToCart: Boolean, val rates: Int)

class PromotionFunc {
    fun isPromotionTarget(args: PromotionFuncArgs): Boolean {
        if (args.rates < 2) {
            return false
        }
        if (args.rates > 3) {
            return false
        }
        if (args.rates == 3) {
            return true
        }
        return args.addToCart && args.rates == 2
    }
}