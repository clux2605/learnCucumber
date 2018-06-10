(new Function(){
	if ('serviceworker' in navigator) {
		navigator.serviceworker
		.register('/service-worker.js')
		.then(function () {
			console.log('Service Worker Registered')
		});
	}
})()