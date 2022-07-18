const express = require('express')
const app = express()
app.get('/health/', (request, response) => {
    response.json({
        status: "OK"
    })
})
app.listen(8000)