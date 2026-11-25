package dto.mistral

data class MistralChatResponse(
    val id: String? = null,
    val choices: List<MistralChoice> = emptyList()
)