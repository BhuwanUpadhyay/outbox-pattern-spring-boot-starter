import http from 'k6/http';

export default function () {
    var url = 'http://localhost:8080/outboxes/fire';
    var payload = JSON.stringify({
        email: 'johndoe@example.com',
        password: 'PASSWORD',
    });

    var params = {
        headers: {
            'Content-Type': 'application/json',
        },
    };

    http.get(url, params);
}
