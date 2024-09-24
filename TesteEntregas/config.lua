Config = {}

Config.Mission = {
    name = "Entrega de Carga",
    description = "Entrega de Suprimentos"
    startLocation = { x = 123.4, y = 567.8, z = 90.1 },
    wagonModel = "wagonModelName",
    reward = 1000,
    destination = { x = 200.0, y = 600.0, z = 90.1 },
    thieves = {
        { model = "a_m_m_farmer_01", location = { x = 130.0, y = 570.0, z = 90.1 }, heading = 0.0, weapon = "WEAPON_REVOLVER" },
        { model = "a_m_m_farmer_01", location = { x = 135.0, y = 575.0, z = 90.1 }, heading = 0.0, weapon = "WEAPON_REVOLVER" }
    }
}