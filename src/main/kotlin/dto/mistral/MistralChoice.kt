package dto.mistral

data class MistralChoice(
    val index: Int? = null,
    val message: MistralMessage? = null,
    val finish_reason: String? = null
)