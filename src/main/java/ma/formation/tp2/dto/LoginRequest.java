package ma.formation.tp2.dto;

public record LoginRequest(
        String email,
        String password
) {
}