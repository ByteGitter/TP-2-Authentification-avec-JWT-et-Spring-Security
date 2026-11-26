package ma.formation.tp2.dto;

public record RegisterRequest(
        String email,
        String password
) {
}