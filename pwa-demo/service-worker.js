var cacheName = 'PWADemo-v1';
var filesToCache = [
    '/index.html',
    '/css/app.css', '/js/app.js', ''
];

self.addEventListener('install', function(e)[
    console.log('[ServiceWorker] Install'); e.waitUntil(
        caches.open(cacheName).then(function(cache) {
            console.log('[ServiceWorker] Caching app shell');
            return cache.addAll(filesToCache);
        })
    );
]);


var cacheName = 'PWADemo-v2';
var filesToCache = [
  //...
];

self.addEventListener('install', function(e) {
  console.log('[ServiceWorker] Install');
  //...
});

self.addEventListener('activate', function(e) {
	console.log('[ServiceWorker] Activate');
	e.waitUntil(
	  caches.keys().then(function(keyList) {
		return Promise.all(keyList.map(function(key) {
		  if (key !== cacheName) {
			console.log('[ServiceWorker] Removing old cache', key);
			return caches.delete(key);
		  }
		}));
	  })
	);
  });